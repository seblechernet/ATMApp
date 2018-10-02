DB [Set AccountNumber1 to 001
    Set Balance1 to 100.00$
    Set PIN1 to 0000
    Set AccountNumber2 to 002
    Set Balance2 to 200.00$
    Set PIN2 to 1111
    Set Account3 to 003
    Set Balance3 to 300.00$
    Set PIN3 to 2222]


   DEFINE AccountNumber as Integer Number
   DEfINE Pin as Integer Number
   DEFINE Count as Integer Number
   DEFINE Balance as Decimal Number
   DEFINE Check as Boolean
   DEFINE Choice as Integer Number
   DEFINE WithDraw as Decimal Number
   DEFINE Deposite as Decimal Number
   DEFINE ContorQuit as  String

   PRINT "Enter your account number"
   INPUT the AccountNumber


   IF AccountNumber is In DB
       INPUT Pin
       Set Count = zero
       Set Check =False
         IF Pin is not equal to Pin in DB
           WHILE count<=3 or Check=False
             Print "Not a correct Pin please enter again"
             INPUT Pin
               IF Pin is equal to Pin in DB
                  Check=True
               ELSE
                  Count = Count + 1
           END WHILE
           IF Count>=3
               PRINT "You can not log in Good Bye"
         END IF

       SET ContorQuit as "Continue"
       While ContorQuit="Continue"
         PRINT "Choose from the list
                                   1. Check Balance
                                   2. WithDraw
                                   3. Deposite  "
         INPUT Choice
         IF Choice = 1
            PRINT Balance
            PRINT " Do you want to Continue"
            INPUT ContorQuit

         IF Choice = 2
             PRINT "How Much Do You want to WithDraw"
             INPUT WithDraw
             IF WithDraw <= Balance
               Balance=Balance-WithDraw
               PRINT "Now your Balance is" Balance
             ELSE
               PRINT "Not Enough Balance"
             PRINT " Do you want to Continue"
             INPUT ContorQuit
         IF Choice = 3
             PRINT "How Much Do You Want to Deposite"
             INPUT  Deposite
             Balance = Balance + Deposite
             PRINT "Now your Balance is" Balance
             PRINT " Do you want to Continue"
             INPUT ContorQuit
         END WHILE





























   IF AccountNumber = AccountNumber2
         INPUT Pin
       Set Count = zero
       Set Check =False
         IF Pin is not equal to Pin2
           WHILE count<=3 or Check=False
             Print "Not a correct Pin please enter again"
             INPUT Pin
               IF Pin is equal to Pin2
                 SET Balance=Balance3;
                 Check=True
               ELSE
                  Count = Count + 1
           END WHILE
           IF Count>=3
             PRINT "You can not log in Good Bye"
         END IF
         ELSE
           Balance=Balance2;

   IF AccountNumber = AccountNumber3
         INPUT Pin
       Set Count = zero
       Set Check =False
         IF Pin is not equal to Pin3
           WHILE count<=3 or Check=False
             Print "Not a correct Pin please enter again"
             INPUT Pin
               IF Pin is equal to Pin3
                 SET Balance=Balance3;
                 Check=True
               ELSE
                  Count = Count + 1
           END WHILE
           IF Count>=3
             PRINT "You can not log in Good Bye"
         END IF
         ELSE
           Balance=Balance3;






















#Input
     - Account number
     - PIN number
#Process
     1. Prompt the user for an account number
     2. Check if the account number matches any of the existing account numbers
          - if the account does not much with any of the existing accounts then prompt the user to enter the correct
            account number until it matches

     3. If the account number with any of the existing account numbers then prompt the user for the PIN
     4. Check if the PIN matches with the PIN to the specific account
          - if the PIN entered does not match then prompt the user to enter the correct PIN o
          - if the PIN entered could not match for more than three times lock the user out
     5. If the PIN matches then allow the user to log in.
     6. Prompt the user to choose choose which action they want to do
            1. Check Balance
            2. Deposit
            3. With Draw
     7. If the user chooses 1 display the account balance
     8.Prompt the user to quit or to continue
         -if they choose to quit then log out
     9.If the user choose to continue go back to the choices
     10.If the user chooses 2 prompt how much the user wants to withdraw
          - if the withdraw amount is less than the balance allow withdraw and update the balance
          - if the withdraw amount is greater than the balance display a massage that says "do not have enough balance"
     11.If the user chooses 3 prompt the user for how much they want to deposite and add the deposite to the balance
         and update it
