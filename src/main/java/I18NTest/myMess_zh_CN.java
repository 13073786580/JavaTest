package I18NTest;

import java.util.ListResourceBundle;

/**
 * 使用类文件也可以作为资源文件使用
 *
 * Author HouZ.
 * Date: 2017/8/9,
 * Time: 23:01,
 * phone:17621373690
 */
public class myMess_zh_CN extends ListResourceBundle {
    private final Object myData[][] = {
        {"msg","{0},这里是类文件，今天是{1}"}
    };

    @Override
    protected Object[][] getContents() {
        return myData;
    }
}
