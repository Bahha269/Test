from django.db import models


class Crm_table(models.Model):
    Name = models.CharField(max_length=100, blank=True, null=True, default=None)
    Number = models.IntegerField(blank=True, null=True, default=None)
    Email = models.EmailField()
    Date_of_creation = models.DateField(auto_now_add=True)

    def __str__(self):
        return self.Name
