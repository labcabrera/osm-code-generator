package org.lab.osm.generator;

//TODO junit
public class CodeGeneratorTest {

	public static void main(String[] args) {

//		new CodeGenerator().execute( //@formatter:off
//			"jdbc:oracle:thin:@vles044273-011:1521:OBRDVL",
//			"MPD_LD",
//			"MPD_LD",
//			"DL_GNL_PAR",
//			"F_GET",
//			"org.lab.samples.osm",
//			"build/generated/gnl_par"); //@formatter:on

		new CodeGenerator().execute( //@formatter:off
			"jdbc:oracle:thin:@vles044273-011:1521:OBRDVL",
			"MPD_LD",
			"MPD_LD",
			"MPG_K_EX_SINIESTRO_ACCIDENTE",
			"PR_PROCESA_PETICION",
			"org.lab.samples.osm",
			"build/generated/siniestro"); //@formatter:on

//		new CodeGenerator().execute( //@formatter:off
//			"jdbc:oracle:thin:@vles044273-011:1521:OBRDVL",
//			"MPD_LD",
//			"MPD_LD",
//			"MPG_K_EX_SINIESTRO_ACC_WRP",
//			"P_PROCESA_PETICION",
//			"org.lab.samples.osm",
//			"build/generated/siniestro"); //@formatter:on
	}

}
