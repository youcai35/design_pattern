package com.gyc.creational.simplefactory;

/**
 * 描述： 视频工厂类
 */
public class VideoFactory {
    /**
     * 通过类型参数进行判断
     * @param type
     * @return
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 通过反射进行
     * @param cl
     * @return
     */
    public Video getVideo(Class cl){
        Video video = null;
        try {
            video= (Video) Class.forName(cl.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
