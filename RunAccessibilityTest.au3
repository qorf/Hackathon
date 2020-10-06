#include <Constants.au3>

; This is an absolute path to the application's base directory.
Local $jarPath = "/Users/alleew/Documents/NetBeansProjects/Hackathon/AccessibilityTest"

; Run the command line
Run("cmd.exe")

; Wait for the command prompt to become active.
Sleep(1500)

; Now that the prompt is active, navigate to Quorum Studio and run it via Java
Send("cd ")
Send($jarPath)
Send("{ENTER}")
Sleep(500)
Send("java -jar Run/Default.jar{ENTER}")
Sleep(3000)

Send("{TAB 3}")
Sleep(200)
Send("{DOWN}")
Sleep(200)
Send("{RIGHT}")
Sleep(200)
Send("{DOWN 4}")
Sleep(200)
Send("{RIGHT}")
Sleep(200)
Send("{DOWN 2}")
Sleep(200)
Send("{TAB}")
Sleep(1000)

Send("Hello world!")
Sleep(100)
Send("{ENTER}")
Sleep(200)
Send("This is additional text.")
Sleep(100)
Send("{ENTER}")
Sleep(200)
Send("The screen reader may automatically fire events as text is entered.")
Sleep(100)
Send("{ENTER}")
Sleep(200)
Send("Additional events occur when text is deleted or navigated.")
Sleep(100)
Send("{ENTER}")
Sleep(200)

Send("{LSHIFT down}")
Sleep(200)
Send("{UP 2}")
Send("{LSHIFT up}")
Sleep(200)
Send("Replacing text similarly must be considered by the screen reader.")
Sleep(500)
Send("{ALT down}")
Sleep(100)
Send("{F4}")
Sleep(100)
Send("{ALT up}")
Sleep(1000)

Exit
