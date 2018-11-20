import org.openqa.selenium.By

import com.codeborne.selenide.Selenide

Selenide.open("https://www.google.com")

Selenide.$(By.name("q")).val("Katalon Studio").pressEnter();

Thread.sleep(3000)

Selenide.close()