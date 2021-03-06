package edu.wpi.first.jni;

import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.platform.base.VariantComponentSpec;

import java.util.List;
import java.util.Map;

public interface JniNativeBaseSpec extends VariantComponentSpec, JniNativeSpecInternal {
    List<JavaCompile> getJavaCompileTasks();

    void setJavaCompileTasks(List<JavaCompile> compile);

    void setJniCrossCompileOptions(List<JniCrossCompileOptions> options);

    List<JniCrossCompileOptions> getJniCrossCompileOptions();

    boolean getEnableCheckTask();

    void setEnableCheckTask(boolean val);

    Map<JavaCompile, String> getJniHeaderLocations();
}
