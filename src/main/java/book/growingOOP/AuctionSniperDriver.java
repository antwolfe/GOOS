package book.growingOOP;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

import static org.hamcrest.Matchers.equalTo;

// extended application driver class made for the tests
public class AuctionSniperDriver extends JFrameDriver {

    // find a top-level window within timeout
    public AuctionSniperDriver(int timeoutMillis) {
        super(new GesturePerformer(), JFrameDriver.topLevelFrame(named(Main.MAIN_WINDOW_FRAME), showingOnScreen()), new AWTEventQueueProber(timeoutMillis, 100));
    }

    // compares label string in window with expected string. throws exception if different
    public void showsSniperStatus(String statusText) {
        new JLabelDriver(this, named(Main.SNIPER_STATUS_NAME)).hasText(equalTo(statusText));
    }

}
