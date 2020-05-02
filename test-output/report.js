$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Resourcesfolder/Dbqueryvalidation.feature");
formatter.feature({
  "line": 1,
  "name": "employee table validation",
  "description": "Description: Validate that if employee table is having correct records",
  "id": "employee-table-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Validate employee table records",
  "description": "",
  "id": "employee-table-validation;validate-employee-table-records",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@employeetableval"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is already connected mysql database",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "employee column values of empid,empname,empsal,empdept should be displayed as below",
  "rows": [
    {
      "cells": [
        "120",
        "ramesh",
        "5000",
        "software"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinationdatabasetable.user_is_already_connected_mysql_database()"
});
formatter.result({
  "duration": 1616712699,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinationdatabasetable.employee_column_values_of_empid_empname_empsal_empdept_should_be_displayed_as_below(DataTable)"
});
formatter.result({
  "duration": 83944281,
  "status": "passed"
});
});