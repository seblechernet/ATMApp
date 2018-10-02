##Algorithm for ATM APP
  #Input
     -Account number
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

