# Taller 6 – GUIs con Swing y Java2D (Restaurantes)

Aplicación Swing para llevar un diario de restaurantes visitados y por visitar, con un mapa (Java2D) donde se marcan sus ubicaciones.

## Contenido

- `src/` – código fuente (esqueleto con todos los `TODO` completados).
- `imagenes/` – mapa y estrellas usados por la interfaz.
- `diagrama-clases.png` (y `.svg`) – diagrama de clases de la aplicación completa (superclases, interfaces implementadas y asociaciones).
- `.project` / `.classpath` – proyecto Eclipse.
- `Restaurantes.launch` – configuración de ejecución para Eclipse.

## Cómo ejecutar

La aplicación carga las imágenes con rutas relativas (`./imagenes/...`), así que **debe ejecutarse con la carpeta raíz del proyecto como directorio de trabajo**.

### Desde Eclipse

**Requisitos:** Eclipse IDE for Java Developers con un JDK 17 o superior configurado (el JRE que trae Eclipse sirve).

**1. Importar el proyecto**

1. Abrir Eclipse y escoger (o crear) un workspace.
2. Menú `File > Import...`.
3. Seleccionar `General > Existing Projects into Workspace` y pulsar `Next`.
4. En `Select root directory` pulsar `Browse...` y escoger la carpeta de este proyecto (la que contiene `.project`, `src` e `imagenes`).
5. Verificar que aparezca marcado el proyecto **Taller Swing Restaurantes Esqueleto**.
6. Dejar **sin marcar** `Copy projects into workspace` (así el proyecto se usa desde esta misma carpeta) y pulsar `Finish`.

> Alternativa: `File > Open Projects from File System...`, escoger la carpeta y pulsar `Finish`.

Eclipse compila automáticamente el proyecto (`Project > Build Automatically` debe estar activo). Si aparecen errores de JRE: click derecho sobre el proyecto > `Properties > Java Build Path > Libraries` y seleccionar un JRE 17+.

**2. Ejecutar la aplicación**

Opción A – con la configuración incluida:

1. En el `Package Explorer`, expandir el proyecto.
2. Click derecho sobre `Restaurantes.launch` > `Run As > Restaurantes`.
3. Las siguientes veces basta con el botón verde **Run** (▶) de la barra de herramientas o el menú `Run > Run History > Restaurantes`.

Opción B – desde la clase principal:

1. Abrir `src > uniandes.dpoo.swing.interfaz.principal > VentanaPrincipal.java`.
2. Click derecho dentro del editor (o sobre el archivo) > `Run As > Java Application`.

Se abre la ventana **Restaurantes** con la lista de restaurantes de ejemplo.

**Si el mapa o las estrellas no aparecen:** el directorio de trabajo no es la raíz del proyecto. Ir a `Run > Run Configurations... > Java Application > (la configuración) > pestaña Arguments > Working directory`, seleccionar `Default: ${workspace_loc:Taller Swing Restaurantes Esqueleto}` y volver a ejecutar.

### Desde la terminal (Java 17 o superior)

Desde la carpeta raíz del proyecto:

```bash
javac -encoding UTF-8 -d bin $(find src -name "*.java")
java -cp bin uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal
```

## Uso

- **Nuevo**: abre la ventana para agregar un restaurante. Haga click en el mapa para marcar su ubicación, ingrese nombre, calificación y si fue visitado, y presione **Crear restaurante**.
- **Ver todos**: abre el mapa con todos los restaurantes marcados. Los radio buttons **Todos / Visitados** filtran lo que se dibuja.
- Al seleccionar un restaurante en la lista se muestran su nombre, calificación (estrellas) y si fue visitado.
