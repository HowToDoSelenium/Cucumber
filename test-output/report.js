$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/MainPage.feature");
formatter.feature({
  "name": "Concepts",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "MainPage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://cncpts.com/#editorial-mens\" and launch the application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Mens\" and click \"Footwear\" from dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.select_and_click_dropdown(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Brand\" and click \"Nike\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.select_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Gender\" and click \"Mens\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.select_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Product Type\" and click \"FOOTWEAR\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.select_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Size\" and click \"10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.select_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Color\" and click \"BLACK\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.select_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Apply",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.apply()"
});
formatter.result({
  "status": "passed"
});
});