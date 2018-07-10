package org.lab.osm.generator.adapter;

import org.lab.osm.generator.model.CodeGenerationOptions;

public interface JavaCodeGeneratorAdapter<T> {

	void process(T t, CodeGenerationOptions options);

}
