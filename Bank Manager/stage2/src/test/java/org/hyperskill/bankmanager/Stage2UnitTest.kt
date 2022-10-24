package org.hyperskill.bankmanager

import BankManagerUnitTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class Stage2UnitTest : BankManagerUnitTest<MainActivity>(MainActivity::class.java) {


    @Test
    fun testNewUserSignUpFalseUserName() {
        testActivity {
            newUserSignUp(
                "Bob",
                "Wert",
                "Great street 55",
                "43252356",
                "",
                "44753",
                userNameEmptyError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpShortPassword() {
        testActivity {
            newUserSignUp(
                "Rob",
                "Beet",
                "Street w 43",
                "334342234",
                "robb",
                "123",
                passwordShortError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpEmptyPassword() {
        testActivity {
            newUserSignUp(
                "Rob",
                "Beet",
                "Street w 43",
                "334342234",
                "robb",
                "",
                passwordEmptyError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpFalsePhoneNumber() {
        testActivity {
            newUserSignUp(
                "Rob",
                "Beet",
                "Street w 43",
                "",
                "robb",
                "123535",
                phoneNumberError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpFalseAddress() {
        testActivity {
            newUserSignUp(
                "Rob",
                "Beet",
                "",
                "43252356",
                "robb",
                "123543",
                addressError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpFalseLastName() {
        testActivity {
            newUserSignUp(
                "Rob",
                "",
                "Great street 55",
                "43252356",
                "robb",
                "123543",
                lastNameError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpFalseFirstName() {
        testActivity {
            newUserSignUp(
                "",
                "Wert",
                "Great street 55",
                "43252356",
                "robb",
                "12343",
                firstNameError = true
            )
        }
    }

    @Test
    fun testNewUserSignUpTrue() {
        testActivity {
            newUserSignUp(
                "Jack",
                "Wert",
                "New York street 32",
                "3468821",
                "JaWe34",
                "3572"
            )
        }
    }

    @Test
    fun testNewUserSignUpTrue2() {
        testActivity {

            newUserSignUp(
                "Jon",
                "Don",
                "Wall Street 334",
                "5434526563",
                "jonD",
                "123533"
            )
        }
    }


    @Test
    fun checkSignUpUserNameAlreadyExists() {
        testActivity {
            newUserSignUp(
                "Jon",
                "Don",
                "Wall Street 334",
                "5434526563",
                "jonD2",
                "123533"
            )

            newUserSignUp(
                "Jon",
                "Don",
                "Wall Street 334",
                "5434526563",
                "jonD2",
                "123533",
                userNameExistsError = true
            )
        }
    }

    @Test
    fun checkLogInSuccess() {
        //TODO
    }

    @Test
    fun checkLogInFailUserDoesNotExist() {
        //TODO
    }

    @Test
    fun checkLogInFailWrongPass() {
        //TODO
    }
}