package com.st.config;

import com.st.imports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.st")
@Import(MyImportSelector.class)
public class Appconfig {
}
