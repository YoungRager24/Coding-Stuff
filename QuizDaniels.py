import random, os

os.chdir('C:\\Quizzes')

#Quiz data.  Keys are terms and values are the definitions.
terms = {"Software Robots" : "These robots interact with applications and systems",
            "Hyperautomation" : "the application of advanced technologies like RPA, AI, machine learning (ML)",
            "Machine Learning" : "the process that allows software robots and AI to learn new processes through pattern recognition",
            "Deep Learning" : "a pattern-based processing method that is a type of machine learning",
            "Computer Vision" : "the technology that allows automation software to recognize and interact with information",
            "Command-line interface (CLI)" : "a way of interacting with a computer program by triggering actions with lines of text",
            "Business Intellegence" : "a system of technologies, practices, and applications that help companies collect, analyze, and present information related to business operations",
            "Automation design" : "a plan for how RPA will be rolled out in an organization",
            "Artificial Intelligence" : "technology intended to respond to and learn from stimulation in a similar way to human responses",
            "Cognitive automation" : "automation that's a step up from regular RPA",
            "Graphical user interface" : "a method of computer interaction that allows users to trigger program actions with windows, icons, and menus",
            "Hot-seating scenario" : "Working places where employees do not have fixed machines and they are free to use any machine in the working space",
            "Natural language processing (NLP)" : "NLP allows computers to understand, interpret, and mimic human languages",
            "Non-persistent VDI" : "a generic Virtual Desktop Infrastructure that doesn't save shortcuts or file settings that the user makes",
            "Pilot program" : "a test of the automation that follows the initial proof-of-concept phase to see if the robot will perform as expected in more advanced, complicated conditions",
            }

#Create the quizzes and answer key files

for quizNum in range(25):
    
    quizfile=open('rpaquiz%s.txt' % (quizNum +1),'w')

    # Write out the header for the quiz.
    quizfile.write('Name:\n\nDate:\n\nPeriod:\n\n')
    quizfile.write((' '*20)+ 'RPA Quiz (Form%s)'  % (quizNum +1))
    quizfile.write('\n\n')

    #Shuffle the order of the terms
    words=list(terms.keys())
    random.shuffle(words)

    if quizNum==0:
       print (words)
    

    #Loop through all 15 terms, making a question for each.
    for questionnum in range(15):
        #Get right and wrong answers
        correctanswer=terms[words[questionnum]]
        wronganswers=list(terms.values())
        del wronganswers[wronganswers.index(correctanswer)]
        wronganswers=random.sample(wronganswers,3)
        answeroptions=wronganswers+[correctanswer]
        random.shuffle(answeroptions)

        #Write the question and answer options to the quiz file
        quizfile.write('%s. What is the definition of %s?\n'  % (questionnum+1,words[questionnum]))
        for i in range(4):
            quizfile.write('     %s.  %s\n' % ('ABCD'[i],answeroptions[i]))
        quizfile.write('\n')

quizfile.close()
                            
