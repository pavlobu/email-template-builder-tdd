# Email template builder
Written with test-driven approach.
Fully covered with tests. 

## How to run:

import project in your favorite IDE.

run tests from `src/tests`

run example from `ExampleMain.java`

## Example how to use:

refer `main()` method of `src/main/ExampleMain.java` :

```java
public static void main(String[] args) {
        String emailTemplate = "Dear ${applicantName},\n" +
                "\n" +
                "${companyName} is excited to bring you on board as ${jobTitle}.\n" +
                "\n" +
                "We’re just a few formalities away from getting down to work.\n" +
                "Please take the time to review our formal offer.\n" +
                "It includes important details about your compensation, benefits\n" +
                "and the terms and conditions of your anticipated employment\n" +
                "with ${companyName}.\n" +
                "\n" +
                "${companyName} is offering a ${jobType} position for you as ${jobTitle},\n" +
                "reporting to ${reportingTo} starting on ${proposedStartDate} at ${workplaceLocation}.\n" +
                "Expected hours of work are ${workSchedule}.\n" +
                "\n" +
                "In this position, ${companyName} is offering to start you at a pay rate\n" +
                "of ${baseSalary} per ${perTimeBaseSalary}.\n" +
                "You will be paid on a ${paidOnTimeBasis} basis, starting ${dateOfNextPayPeriod}.\n" +
                "\n" +
                "As part of your compensation, we're also offering ${bonus}.\n" +
                "\n" +
                "As an employee of ${companyName} you will be eligible for ${otherBenefits}.\n" +
                "\n" +
                "Please indicate your agreement with these terms and accept this offer by signing\n" +
                "and dating this agreement on or before ${offerExpirationDate}.\n" +
                "\n" +
                "Sincerely, ${senderName} at ${companyName}";
        Template template = new Template(emailTemplate);
        template.set("applicantName", "Your Name");
        template.set("companyName", "FAANG");
        template.set("jobTitle", "a Software Engineer");
        template.set("jobType", "Full-Time");
        template.set("reportingTo", "CTO");
        template.set("proposedStartDate", "13 May 2013");
        template.set("workplaceLocation", "Seattle");
        template.set("workSchedule", "35 hours per one working week with\n" +
                "two days off on Saturdays and Sundays");
        template.set("baseSalary", "999999999999$");
        template.set("perTimeBaseSalary", "year");
        template.set("paidOnTimeBasis", "weekly");
        template.set("dateOfNextPayPeriod", "13 June 2013");
        template.set("bonus", "999999999999$\n" +
                "for each completed full work year with us");
        template.set("otherBenefits", "Health Insurance.");
        template.set("offerExpirationDate", "13 April 2013");
        template.set("senderName", "Hiring Manager");

        System.out.println(template.evaluate());
    }
```

output:

```
Dear Your Name,

FAANG is excited to bring you on board as a Software Engineer.

We’re just a few formalities away from getting down to work.
Please take the time to review our formal offer.
It includes important details about your compensation, benefits
and the terms and conditions of your anticipated employment
with FAANG.

FAANG is offering a Full-Time position for you as a Software Engineer,
reporting to CTO starting on 13 May 2013 at Seattle.
Expected hours of work are 35 hours per one working week with
two days off on Saturdays and Sundays.

In this position, FAANG is offering to start you at a pay rate
of 999999999999$ per year.
You will be paid on a weekly basis, starting 13 June 2013.

As part of your compensation, we're also offering 999999999999$
for each completed full work year with us.

As an employee of FAANG you will be eligible for Health Insurance..

Please indicate your agreement with these terms and accept this offer by signing
and dating this agreement on or before 13 April 2013.

Sincerely, Hiring Manager at FAANG
```

---

## Credits:

Test Driven by Lasse Koskela, 2007, 
publisher: Manning
ISBN 1-932394-85-0
