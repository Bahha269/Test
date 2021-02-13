package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import java.util.Properties;

@Service
public class Uploader {
//    private static final String URL = "jdbc:postgresql://ec2-34-254-69-72.eu-west-1.compute.amazonaws.com:5432/depmtrluc8v8an";
//    private static final String PASSWORD = "a6e77d8d489755989dffa71dd6c09a0dc302010e032a35b093242937857ffacb";
//    private static final String USER = "mmpbxcxfgfbkkq";
    private static final String URL = "jdbc:postgresql:test";
    private static final String USER = "test";
    private static final String PASSWORD = "root";
    private static final String SQL = "INSERT INTO results VALUES(?,?,?,?,?,?,?,?,?)";

    public void upload(MultipartFile file) throws IOException, SQLException {
        Properties props = new Properties();
        props.setProperty("user",USER);
        props.setProperty("password",PASSWORD);
        try (Connection conn = DriverManager.getConnection(URL, props);
             PreparedStatement statement = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {
            int count = 0;
            XSSFWorkbook book = new XSSFWorkbook(file.getInputStream());
            for (int i = 0; i < book.getNumberOfSheets(); i++) {
                XSSFSheet sheet = book.getSheetAt(i);
                Iterator<Row> rowIterator= sheet.iterator();
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator= row.iterator();
                    int parameterCount = 1;
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        statement.setString(parameterCount, getStringValue(cell));
                        ++parameterCount;
                    }
                    statement.addBatch();
                    ++count;
                    if (count % 1000 == 0 || !rowIterator.hasNext()) {
                        statement.executeBatch();
                    }
                }
            }
        } catch (SQLException | IOException exception) {
            throw exception;
        }
    }

    private static String getStringValue(Cell cell) {
        if (cell.getCellType() == CellType.NUMERIC) {
            return cell.getNumericCellValue() + "";
        }
        return cell.getStringCellValue();
    }
}
