$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/yemioluv/eclipse-workspace/com.giftrete/src/test/java/features/CreateAnAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create an account",
  "description": "",
  "id": "create-an-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "create a giftrete account",
  "description": "",
  "id": "create-an-account;create-a-giftrete-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigate to giftrete website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user click on the create an account tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user fillin the register page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user click register tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Account Activation By Code page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountStep.user_navigate_to_giftrete_website()"
});
formatter.result({
  "duration": 7716144355,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStep.the_user_click_on_the_create_an_account_tab()"
});
formatter.result({
  "duration": 2775829955,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStep.the_user_fillin_the_register_page()"
});
formatter.result({
  "duration": 1219468355,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStep.the_user_click_register_tab()"
});
formatter.result({
  "duration": 129671831,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountStep.account_Activation_By_Code_page_should_be_displayed()"
});
formatter.result({
  "duration": 30083,
  "status": "passed"
});
});