[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-10-josephus-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-10-josephus-username)

# Lab 10 - Josephus

## Lab Goal
In this lab you will be answering some questions about the results of the Josephus problem.

## Background
From Wikipedia:

The problem is named after Flavius Josephus, a Jewish historian living in the 1st century. According to Josephus' account of the siege of Yodfat, he and his 40 soldiers were trapped in a cave by Roman soldiers. They chose suicide over capture, and settled on a serial method of committing suicide by drawing lots. Josephus states that by luck or possibly by the hand of God, he and another man remained until the end and surrendered to the Romans rather than killing themselves. This is the story given in Book 3, Chapter 8, part 7 of Josephus' The Jewish War (writing of himself in the third person):

> However, in this extreme distress, he was not destitute of his usual sagacity; but trusting himself to the providence of God, he put his life into hazard [in the manner following]: "And now," said he, "since it is resolved among you that you will die, come on, let us commit our mutual deaths to determination by lot. He whom the lot falls to first, let him be killed by him that hath the second lot, and thus fortune shall make its progress through us all; nor shall any of us perish by his own right hand, for it would be unfair if, when the rest are gone, somebody should repent and save himself." This proposal appeared to them to be very just; and when he had prevailed with them to determine this matter by lots, he drew one of the lots for himself also. He who had the first lot laid his neck bare to him that had the next, as supposing that the general would die among them immediately; for they thought death, if Josephus might but die with them, was sweeter than life; yet was he with another left to the last, whether we must say it happened so by chance, or whether by the providence of God. And as he was very desirous neither to be condemned by the lot, nor, if he had been left to the last, to imbrue his right hand in the blood of his countrymen, he persuaded him to trust his fidelity to him, and to live as well as himself.

## Instructions
 * Complete the `getSurvivor` method. It is passed the number of people in the circle (or line) and the number of the count.  It returns the starting location of the last survivor.  This is the method that is tested by the unit tests.
 * You may want to use the `kill` method, which you can complete so that it will reduce the array of the living by the one that is killed.
 * You can also use the `runTest` method as a place to start to find answers to the questions below.
 * Make sure you add a javadoc comment on each method.  You'll need to include a `@param` tag for each method that accepts a parameter.  Include a `@return` tag on any method that returns a value.

## Questions
Answer the following questions using data from your program. You may have your program calculate and process the data for you, or you may just want your program to reduce the amount of data you need to look at.  Either is a fine approach, just make sure you justify your answer using results from your program.

Edit the Readme.md file to add your answers after each question.

1. If you had to quickly choose a place to stand, should you choose an odd or even numbered location assuming the count starts at 0?

<Type the answer to \#1 here>

2. If you are the person starting the count (location 0), how often do you survive?

<Type the answer to \#2 here>

3. (optional) Were you able to find any other interesting information from your results?

<Type the answer to \#3 here>

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.
* Edit the first line of the Readme.md file and put your username in both locations that say "username".  This is necessary if you want the badge at the top of the instructions to show red or green based on your most recent commit.

## Grading
* 50 - `getSurvivor` works
* 40 - Answered both questions with reasonable answers based on the supporting data.
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
