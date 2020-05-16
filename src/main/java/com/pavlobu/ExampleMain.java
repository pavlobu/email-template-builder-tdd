package com.pavlobu;

/**
 * Created by Pavlo (Paul) Buidenkov on 2020-05-16
 */
public class ExampleMain {
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
}
