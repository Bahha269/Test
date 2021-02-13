few-buttons-uploader

Описание: веб-приложение, принимающее excel файлы заданного формата, и добавляющее содерижимое загруженных файлов в базу данных

Формат файла: файлы являются результатом парсинга поисковой выдачи сайта wildberries, содержат следующеие столбцы: 
Артикул
Наименование
Цена без акции
Цена по акции
Описание
Частота покупки
Оценка
Кол-во отзывов
Cтрана производитель

База данных содержит аналогичные столбцы в таблице results(единственная созданная таблица).

Использованный стек:
frontend: react JS (требование задание, без использования jsx)
backend: spring boot, maven, apache poi (работа с excel файлами)

Используется СУБД postgreSQL.
Heroku credentials:
Host
    ec2-34-254-69-72.eu-west-1.compute.amazonaws.com
Database
    depmtrluc8v8an
User
    mmpbxcxfgfbkkq
Port
    5432
Password
    a6e77d8d489755989dffa71dd6c09a0dc302010e032a35b093242937857ffacb
URI
    postgres://mmpbxcxfgfbkkq:a6e77d8d489755989dffa71dd6c09a0dc302010e032a35b093242937857ffacb@ec2-34-254-69-72.eu-west-1.compute.amazonaws.com:5432/depmtrluc8v8an
Heroku CLI
    heroku pg:psql postgresql-reticulated-02548 --app few-buttons-uploader