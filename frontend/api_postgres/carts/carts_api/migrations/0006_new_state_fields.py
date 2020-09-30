# Generated by Django 2.2.13 on 2020-09-29 05:47

import django.contrib.postgres.fields
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ("carts_api", "0005_appuser"),
    ]

    operations = [
        migrations.AddField(
            model_name="state",
            name="program_names",
            field=django.contrib.postgres.fields.ArrayField(
                base_field=models.CharField(max_length=64),
                default=list,
                size=None,
            ),
        ),
        migrations.AddField(
            model_name="state",
            name="program_type",
            field=models.CharField(
                choices=[
                    ("combo", "Combination"),
                    ("medicaid_exp_chip", "Medicaid Expansion CHIP only"),
                    ("separate_chip", "Separate CHIP only"),
                ],
                default="combo",
                max_length=32,
            ),
        ),
    ]