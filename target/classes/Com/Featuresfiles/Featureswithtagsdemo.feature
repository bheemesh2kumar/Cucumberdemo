Feature:  Testing cucumber with tags diferent levels

@Smoketest
Scenario: below test for smoke  testing
Given user is performed smoke testing

@Systemtest
Scenario: below test for system  testing
Given user is performed system  testing


@Adhoctesst @Systemtest
Scenario: below test for adhoc  testing and system testing 
Given user is performed adhoc  testing and system testing 

@Regressiontest
Scenario: below test for  regression  testing
Given user is performed  regression  testing


@Uattest
Scenario: below test for  UAT  testing
Given user is performed UAT  testing


@Stagingteset @Adhoctest
Scenario: below test for  Staging env  testing  and adhc test
Given user is performed Staging env  testing  and adhc test

@Prodtest @Stagingtessst @Regressiontest
Scenario: below test for  Prod env and staging and regression  testing
Given user is performed Prod env and staging and regression  testing

