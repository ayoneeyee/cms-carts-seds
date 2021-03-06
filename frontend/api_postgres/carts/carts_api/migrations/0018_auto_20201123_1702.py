# Generated by Django 2.2.13 on 2020-11-23 17:02

from django.db import migrations
import django_db_views.migration_functions
import django_db_views.operations


class Migration(migrations.Migration):

    dependencies = [
        ("carts_api", "0017_userprofiles"),
    ]

    operations = [
        django_db_views.operations.ViewRunPython(
            code=django_db_views.migration_functions.ForwardViewMigration(
                "SELECT a.id,\n            a.password,\n            a.last_login,\n            a.is_superuser,\n            a.username,\n            a.first_name,\n            a.last_name,\n            a.email,\n            a.is_staff,\n            a.is_active,\n            a.date_joined,\n            r.user_role,\n            s.state_codes\n           FROM ((auth_user a\n             LEFT JOIN carts_api_rolefromusername r ON (((r.username)::text = (a.username)::text)))\n             LEFT JOIN carts_api_statesfromusername s ON (((s.username)::text = (a.username)::text)))",
                "vw_userprofile",
            ),
            reverse_code=django_db_views.migration_functions.BackwardViewMigration(
                "", "vw_userprofile"
            ),
            atomic=False,
        ),
    ]
