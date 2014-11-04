<h1>Enunciado</h1>

Nos piden realizar un sistema que centralice la información de los siguientes sistemas, y persistir sus datos en una base de datos relacional.

Debemos interactuar con los siguientes modulos:

El módulo de proyectos nos provee mediante una API Rest, los siguientes datos de un proyecto en particular:

<pre>
proyecto = {
  codigo: 001,
  nombre: 'proyecto ultra secreto',
  empleados: [{
      codigo: 047,
      nombre: 'marina',
      apellido: 'munilla',
      puesto: 'project manager',
      telefono: '4444-4444',
      domicilio: 
      {
        direccion: 'avenida siempre viva 742',
        ciudad: 'CABA',
        provincia: 'CABA'
      }
      salario: 20000
    }, {
      codigo: 007,
      nombre: 'aldana,
      apellido: 'quintana munilla',
      puesto: 'desarrolladora jr',
      telefono: '4444-4442',
      domicilio: {
        direccion: 'calle falsa 123',
        ciudad: 'CABA',
        provincia: 'CABA'
      }
      salario: 6000
    }
  ]
}
</pre>

El módulo de RRHH nos provee las licencias de los empleados depositando un archivo con el siguiente formato.

codigo_empleado|fecha_inicio|fecha_finalizacion|categoria|codigo_razon|descripcion_razon|

