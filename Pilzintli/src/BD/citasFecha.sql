SELECT
     consulta.`id` AS consulta_id,
     consulta.`fecha` AS consulta_fecha,
     consulta.`hora` AS consulta_hora,
     paciente.`nombre` AS paciente_nombre,
     paciente.`apellido_paterno` AS paciente_apellido_paterno,
     paciente.`apellido_materno` AS paciente_apellido_materno
FROM
     `paciente` paciente INNER JOIN `consulta` consulta ON paciente.`id` = consulta.`paciente_id`
WHERE
     fecha LIKE '2022-09-17'