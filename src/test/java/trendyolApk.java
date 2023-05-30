import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class trendyolApk {
    @Test
    public void app() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","12.0");
        desiredCapabilities.setCapability("deviceName","74ab1cf");
        //desiredCapabilities.setCapability("deviceName","Pixel 2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\Dell\\Desktop\\Software\\trendyolAppium\\src\\Apps\\Trendyol.apk");
        AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.id("trendyol.com:id/buttonSelectGenderMan")).click();
    driver.findElement(By.id("trendyol.com:id/imageViewTooltipClose")).click();
    driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.widget.ImageView")).click();
    driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"harun yücel\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    driver.findElement(By.id("trendyol.com:id/editTextPassword")).sendKeys("ismail25400");
    driver.findElement(By.id("trendyol.com:id/buttonLogin")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup")).click();


    driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Anasayfa\"]/android.widget.ImageView")).click();
        // arama butonuna tıklandı
    driver.findElement(By.id("trendyol.com:id/search_view_inner_container")).click();

        // product selected
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.TextView")).click();

        // product clicked

    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/x1.a/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView")).click();

        // added to cart

    driver.findElement(By.id("trendyol.com:id/primaryButton")).click();

        // added to cart check
    driver.findElement(By.id("trendyol.com:id/buttonAddToBasketOrChooseVariant")).click();

        // added to cart check

    driver.findElement(By.id("trendyol.com:id/buttonApproveBasket")).click();


    //come get point

    driver.findElement(By.id("trendyol.com:id/relativeDeliveryMissingNeighborhoodInfo")).click();


    // select card
    driver.findElement(By.id("trendyol.com:id/editTextPaymentCardInformationCardNumber")).click();
    driver.findElement(By.id("android:id/content")).click();



    driver.findElement(By.id("trendyol.com:id/editTextPaymentCardInformationCardNumber")).sendKeys("4852658575458565");
    driver.findElement(By.id("trendyol.com:id/imageLeft")).click();
    driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Anasayfa\"]/android.widget.ImageView")).click();




    }




}
