package mvc.type;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 3zZ.
 * @date 2020/9/25.
 */
public class ModelAndView {
    /**
     * 页面所在的路径
     */
    @Getter
    private String view;

    /**
     * 页面的data数据
     */
    @Getter
    private Map<String, Object> model = new HashMap<>();

    public ModelAndView setView(String view) {
        this.view = view;
        return this;
    }

    // modelAndView.setView("addheadline.jsp").addViewData("aaa", "bbb");

    public ModelAndView addViewData(String attributeName, Object attributeValue) {
        model.put(attributeName, attributeValue);
        return this;
    }
}
