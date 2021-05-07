from django.shortcuts import render
from django.http import HttpResponse
from .models import *


def page_1(request):
    return render(
        request,
        'Page1.html',
    )


def page_2(request):
    return render(
        request,
        'Page2.html',
    )


def page_3(request):
    return render(
        request,
        'Page3.html',
    )


def transactions_details_1(request):
    Transactions = Crm_table.objects.get(pk=1)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details.html',
        context
    )


def transactions_details_2(request):
    Transactions = Crm_table.objects.get(pk=2)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details2.html',
        context
    )


def transactions_details_3(request):
    Transactions = Crm_table.objects.get(pk=3)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details3.html',
        context
    )


def transactions_details_4(request):
    Transactions = Crm_table.objects.get(pk=4)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details4.html',
        context
    )


def transactions_details_5(request):
    Transactions = Crm_table.objects.get(pk=5)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details5.html',
        context
    )


def transactions_details_6(request):
    Transactions = Crm_table.objects.get(pk=6)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details6.html',
        context
    )


def transactions_details_7(request):
    Transactions = Crm_table.objects.get(pk=7)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details7.html',
        context
    )


def transactions_details_8(request):
    Transactions = Crm_table.objects.get(pk=8)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details8.html',
        context
    )


def transactions_details_9(request):
    Transactions = Crm_table.objects.get(pk=9)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details9.html',
        context
    )


def transactions_details_10(request):
    Transactions = Crm_table.objects.get(pk=10)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details10.html',
        context
    )


def transactions_details_11(request):
    Transactions = Crm_table.objects.get(pk=11)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details11.html',
        context
    )


def transactions_details_12(request):
    Transactions = Crm_table.objects.get(pk=12)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details12.html',
        context
    )


def transactions_details_13(request):
    Transactions = Crm_table.objects.get(pk=13)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details13.html',
        context
    )


def transactions_details_14(request):
    Transactions = Crm_table.objects.get(pk=14)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details14.html',
        context
    )


def transactions_details_15(request):
    Transactions = Crm_table.objects.get(pk=15)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details15.html',
        context
    )


def transactions_details_16(request):
    Transactions = Crm_table.objects.get(pk=16)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details16.html',
        context
    )


def transactions_details_17(request):
    Transactions = Crm_table.objects.get(pk=17)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details17.html',
        context
    )


def transactions_details_18(request):
    Transactions = Crm_table.objects.get(pk=18)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details18.html',
        context
    )


def transactions_details_19(request):
    Transactions = Crm_table.objects.get(pk=19)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details19.html',
        context
    )


def transactions_details_20(request):
    Transactions = Crm_table.objects.get(pk=20)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details20.html',
        context
    )


def transactions_details_21(request):
    Transactions = Crm_table.objects.get(pk=21)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details21.html',
        context
    )


def transactions_details_22(request):
    Transactions = Crm_table.objects.get(pk=22)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details22.html',
        context
    )


def transactions_details_23(request):
    Transactions = Crm_table.objects.get(pk=23)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details23.html',
        context
    )


def transactions_details_24(request):
    Transactions = Crm_table.objects.get(pk=24)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details24.html',
        context
    )


def transactions_details_25(request):
    Transactions = Crm_table.objects.get(pk=25)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details25.html',
        context
    )


def transactions_details_26(request):
    Transactions = Crm_table.objects.get(pk=26)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details26.html',
        context
    )


def transactions_details_27(request):
    Transactions = Crm_table.objects.get(pk=27)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details27.html',
        context
    )


def transactions_details_28(request):
    Transactions = Crm_table.objects.get(pk=28)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details28.html',
        context
    )


def transactions_details_29(request):
    Transactions = Crm_table.objects.get(pk=29)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details29.html',
        context
    )


def transactions_details_30(request):
    Transactions = Crm_table.objects.get(pk=30)
    context = {
        "Transactions": Transactions,
    }
    return render(
        request,
        'details30.html',
        context
    )
