package org.lab.samples.osm.tron.contract.test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.contract.executor.LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContractTestConfiguration.class })
public class ContractTest {

	@Autowired
	private LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor executor;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void test() throws Exception {
		LocalDate localDate = LocalDate.now().minusDays(300);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Object[] args = new Object[100];

		args[0] = 41L; // p_cod_cia => 41,
		args[1] = "11"; // p_origen_consulta => 11,
		args[2] = "0731600002399"; // p_num_poliza => '0731600002399',
		args[3] = 0L; // p_num_apli => 0,
		args[4] = 0L; // p_num_spto_apli => 0,
		args[5] = date; // p_fecha_consulta => SYSDATE,--SYSDATE-363
		args[6] = "N"; // p_mca_spto_tmp => 'N',
		args[7] = "N"; // p_mca_datos_gen => 'N',
		args[8] = "N"; // p_mca_ind_coa => 'N',
		args[9] = "N"; // p_mca_agente => 'N',
		args[10] = "N"; // p_mca_datos_oa => 'N',
		args[11] = "N"; // p_mca_dir_corresp => 'N',
		args[12] = "N"; // p_mca_fig_part_pol => 'N',
		args[13] = "N"; // p_mca_fig_part_oa => 'N',
		args[14] = "N"; // p_mca_cob_pol => 'N',
		args[15] = "N"; // p_mca_cob_oa => 'N',
		args[16] = "N"; // p_mca_bonif_pol => 'N',
		args[17] = "N"; // p_mca_bonif_oa => 'N',
		args[18] = "N"; // p_mca_plan_pago => 'N',
		args[19] = "N"; // p_mca_medio_pago => 'N',
		args[20] = "N"; // p_mca_desglose_eco => 'N',
		args[21] = "N"; // p_mca_desglose_eco_oa => 'N',
		args[22] = "N"; // p_mca_obtener_prima => 'N',
		args[23] = "N"; // p_mca_texto_pol => 'N',
		args[24] = "N"; // p_mca_texto_oa => 'N',
		args[25] = "N"; // p_mca_clau_pol => 'N',
		args[26] = "N"; // p_mca_clau_oa => 'N',
		args[27] = "S"; // p_mca_consulta_global => 'S',
		args[28] = "N"; // p_mca_con_des_emision => 'N',
		args[29] = "S"; // p_mca_lk => 'S',
		args[30] = "es_ES"; // p_cod_idioma => 'es_ES',
		args[31] = "22"; // p_cod_docum_destino => 22,
		args[32] = 1; // p_cod_canal => 1,
		args[33] = "1170014"; // p_clave_produccion => 1170014,
		args[34] = "NSE_CENTRAL_S"; // p_cod_rol => 'NSE_CENTRAL_S',
		args[35] = "NSECENT"; // p_cod_usr => 'NSECENT',
		args[36] = "N"; // p_mca_segregar => 'N',

		Map<String, Object> result = executor.execute(args);
		Assert.assertNotNull(result);

		String json = objectMapper.writeValueAsString(result);
		System.out.println("---");
		System.out.println(json);
		System.out.println("---");
	}

}
