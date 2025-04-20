## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
#  Simulador de Viajes Interplanetarios 

Este es un proyecto en Java que simula un viaje espacial a diferentes planetas del sistema solar. El usuario puede seleccionar un planeta de destino, elegir una nave y experimentar una simulación con eventos aleatorios que afectan la misión.

##  Características del Proyecto

- Selección de planetas con características únicas: distancia, gravedad, atmósfera y criatura final.
- Navegación con diferentes naves espaciales, cada una con velocidad, combustible, oxígeno y vida.
- Simulación del viaje con eventos aleatorios como tormentas solares, meteoritos y ayuda de otras naves.
- Sistema de decisiones en algunos eventos que afectan el resultado del viaje.
- Interfaz por consola amigable para el usuario.

##  Cómo ejecutar el proyecto

### 1. Requisitos

- Java JDK 8 o superior
- IDE como IntelliJ, Eclipse o puedes compilarlo desde consola

### 2. Instrucciones

1. Descarga o clona el repositorio.
2. Abre una terminal o tu IDE favorito.
3. Compila los archivos `.java`:

```bash
javac App.java infoplanetas.java nave.java simulacion.java SistemadeViajeInterplanetario.java
4. Ejecuta el programa principal:

bash
Copiar
Editar
java App
3. Estructura del Proyecto
cpp
Copiar
Editar
.
├── App.java                         // Clase principal con el menú interactivo
├── infoplanetas.java               // Clase con datos de los planetas
├── nave.java                       // Clase con detalles de la nave espacial
├── simulacion.java                 // Lógica del viaje y eventos aleatorios
├── SistemadeViajeInterplanetario.java // Métodos para seleccionar planeta y nave
└── README.md                       // Este archivo
! Notas
Solo se puede iniciar el viaje si has seleccionado un planeta y una nave.

El viaje puede fallar si se acaba el oxígeno o se destruye la nave.

Al llegar al planeta, enfrentarás una criatura final.

📚 Créditos
Creado por [Jefferson Andrés Estupiñan Cardenas y Carlos Manuel Estupiñan Cardenas]
Estudiante de Java Senior En DEv Senior Code