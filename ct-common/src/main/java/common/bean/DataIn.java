package common.bean;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * 输入流接口
 */
public interface DataIn extends Closeable {

    public void setPath(String path);
    public Object read() throws IOException;
    public <T extends Data> List<T> read(Class<T> clazz);
}
