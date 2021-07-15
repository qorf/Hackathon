/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins.quorum.Libraries.Interface.Accessibility;

import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import plugins.quorum.Libraries.Game.DesktopDisplay;
import plugins.quorum.Libraries.Game.GameStateManager;
import plugins.quorum.Libraries.Interface.AccessibilityManager;
import quorum.Libraries.Interface.Controls.Button_;
import quorum.Libraries.Interface.Controls.TextField_;
import quorum.Libraries.Interface.Controls.ToggleButton_;
import quorum.Libraries.Interface.Events.ControlActivationEvent_;
import quorum.Libraries.Interface.Events.FocusEvent_;
import quorum.Libraries.Interface.Events.MenuChangeEvent_;
import quorum.Libraries.Interface.Events.ProgressBarValueChangedEvent_;
import quorum.Libraries.Interface.Events.SelectionEvent_;
import quorum.Libraries.Interface.Events.TextChangeEvent_;
import quorum.Libraries.Interface.Events.TreeChangeEvent_;
import quorum.Libraries.Interface.Events.TreeTableChangeEvent_;
import quorum.Libraries.Interface.Events.WindowFocusEvent_;
import quorum.Libraries.Interface.Item_;

public class AccessKitAccessibility {
    public java.lang.Object me_ = null;
    static long macHandle = -1;
    static {
            macHandle = org.lwjgl.glfw.GLFWNativeCocoa.glfwGetCocoaWindow(DesktopDisplay.window);
            String windowTitle = GameStateManager.game.GetDesktopConfiguration().Get_Libraries_Game_DesktopConfiguration__title_();

    }
    public void  NameChanged(Item_ item) {}

    public void  DescriptionChanged(Item_ item) {}

    public void  TextFieldUpdatePassword(TextField_ field) {}

    public void  Update() {}

    public void  ProgressBarValueChanged(ProgressBarValueChangedEvent_ progress) {}

    public void  SelectionChanged(SelectionEvent_ event) {}

    public void  ButtonActivated(Button_ button) {}

    public void  ToggleButtonToggled(ToggleButton_ button) {}

    public void  FocusChanged(FocusEvent_ event) {}

    public void  Add(Item_ item) {
        System.out.println("Item: " + item.GetName());
    }

    public void  Remove(Item_ item) {}

    public void  MenuChanged(MenuChangeEvent_ event) {}

    public void  TreeChanged(TreeChangeEvent_ event) {}

    public void  TreeTableChanged(TreeTableChangeEvent_ event) {}

    public void  ControlActivated(ControlActivationEvent_ event) {}

    public void  TextChanged(TextChangeEvent_ event) {}

    public void  WindowFocusChanged(WindowFocusEvent_ event) {}

    public void  Notify(Item_ item, String value) {}

    public void  Notify(Item_ item, String value, int notificationType) {}

    public void  Shutdown() {}
}
