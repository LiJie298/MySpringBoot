//package com.lijie.resourceView;
//
//import freemarker.cache.StringTemplateLoader;
//import freemarker.cache.TemplateLoader;
//import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
//
//import java.util.List;
//
///**
// * @author lijie7
// * @date 2018/1/31
// * @Description
// * @modified By
// */
//public class MyFreeMarkConfig extends FreeMarkerConfigurer {
//
//    @Override
//    protected void postProcessTemplateLoaders(List<TemplateLoader> templateLoaders) {
//        StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
//        stringTemplateLoader.putTemplate("templateLoaderPath", "WEB-INF/classes/views/");
//        templateLoaders.add(stringTemplateLoader);
//        super.postProcessTemplateLoaders(templateLoaders);
//
//    }
//}
