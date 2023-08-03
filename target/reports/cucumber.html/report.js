$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Bank\u0026CashAddNewCustomer.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account\t",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters  password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on bankandCash button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on newAccount button",
  "keyword": "And "
});
formatter.step({
  "name": "User enters accountTitleas as \"\u003caccountTitle\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters description as \"\u003cdescription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters initialBalance as \"\u003cinitialBalance\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters accountNumber as \"\u003caccountNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters contactPerson as \"\u003ccontactPerson\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Phone as \"\u003cPhone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters internetBankingURL as \"\u003cinternetBankingURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "john",
        "bank of america",
        "$ 3456",
        "46578333",
        "John",
        "3456573456",
        "https://www.techfios.com/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account\t",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_the_in_the_fieldUserName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters  password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_password_in_Passwordfield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bankandCash button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_bankandCash_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on newAccount button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_newAccount_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountTitleas as \"john\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_accountTitleas_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters description as \"bank of america\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_description_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initialBalance as \"$ 3456\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_initialBalance_as_$(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountNumber as \"46578333\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_accountNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contactPerson as \"John\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_contactPerson_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Phone as \"\u003cPhone\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_Phone_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internetBankingURL as \"https://www.techfios.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_internetBankingURL_as_https_www_techfios_com(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});