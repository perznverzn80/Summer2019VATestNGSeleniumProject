
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Vytrack automation" verbose="10">

<!--    HOW TO RUN MANY SPECIFIC METHODS USING EXCLUDE-->
<test name="Vytrack smoke tests">
<classes>
<class name="com.cybertek.tests.d17_extent_reports.NegativeLoginTestWithReports">
<methods>
<exclude name="wrongPasswordTest"/>
</methods>
</class>
</classes>
</test>

</suite>