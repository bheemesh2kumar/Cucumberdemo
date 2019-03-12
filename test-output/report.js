$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/home/workspace/CucumberProject/src/main/java/Com/Featuresfiles/Featureswithtagsdemo.feature");
formatter.feature({
  "line": 1,
  "name": "Testing cucumber with tags diferent levels",
  "description": "",
  "id": "testing-cucumber-with-tags-diferent-levels",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 31,
  "name": "below test for  Prod env and staging and regression  testing",
  "description": "",
  "id": "testing-cucumber-with-tags-diferent-levels;below-test-for--prod-env-and-staging-and-regression--testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Prodtest"
    },
    {
      "line": 30,
      "name": "@Stagingtessst"
    },
    {
      "line": 30,
      "name": "@Regressiontest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user is performed Prod env and staging and regression  testing",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginstepwithtagsdemo.user_is_performed_Prod_env_and_staging_and_regression_testing()"
});
formatter.result({
  "status": "skipped"
});
});