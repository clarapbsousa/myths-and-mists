# LDTS_T13_G02 - Myths and Mists

## Game Developers
This project was developed by:
- Clara Sousa (up202207583@up.pt),
- João Mendes (up202208586@up.pt),
- Miguel Moita (up202207678@up.pt) for LDTS 2022-23.

## Implemented Features

- **Connected Menus** - The user has the capability of browsing through the different menus. (Ex: Main Menu and Options Menu).
- **Keyboard control** - The keyboard inputs are received through the respective events and interpreted according to the current game state.
- **Player control** - The player may move with the keyboard control, pass through Text-Sections and execute other functions.
- **Collision detection** - Collisions between different objects are verified. (Ex: Player/Orpheus, Dracmas, Enemies, Walls).
- **Different levels** - 3 distinct levels with unique text sections, each offering different contexts, provides a dynamic and engaging narrative structure.
  This approach allows for diverse storytelling elements and contributes to the overall richness and depth of the narrative experience.

## Planned Features
All the planned features were successfully implemented.

## Design Patterns
The patterns applied to the project: **Factory Method Pattern, Composite Pattern, Game Loop Pattern, State Pattern, MVC Architectural Pattern, Template
Method and Facade Pattern**. 

### Factory Method Pattern 
A creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
The base Game class uses the LanternaGUI library for its graphical interface, ensuring consistent behavior across platforms. Through the factory method pattern, platform-specific GUI components can be generated without rewriting the Game class logic. This approach involves interacting with abstract GUI components, maintaining functionality through a common base class or interface.

### Composite Pattern
A structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
In the game, the CompoundGraphic concept is reflected in the MenuState and Menu classes, functioning as an unified container for diverse graphical elements. The client code in the Game class interacts seamlessly with these graphics, abstracted through a common interface, enabling flexible handling of complex graphic structures without direct coupling to specific classes.

### Game Loop Pattern
A behavioral design pattern that orchestrates the continuous and structured execution of steps such as updating, rendering, and handling input in a cycle, ensuring a seamless and responsive gaming experience.
In the Game program, the Game Loop Pattern choreographs the continuous execution of updating, rendering and input handling, ensuring a responsive gaming experience. The cyclical orchestration within the main loop encapsulates the essence of this behavioral design pattern, facilitating a seamless and dynamic gameplay flow.

### State Pattern
This behavioral design pattern is an important part of our game. By implementing it, we can allow loading of "scenes".
We started by creating an abstract class called State that requires a Viewer and a Controller.
All together, we can now create a specific State for a level or for a menu.
This state simplifies and improves our code.

### MVC architectural Pattern

MVC stands for Model View Controller.
This pattern mostly relates to the UI/interaction layer of our game, allowing these three aspects to work together.
- Model - includes the class code itself, the pure application data and logic.
- Viewer - presents the data to the user, in this case, printing out to the GUI the information specified in the model.
- Controller - exists between the Model and the Viewer, listening to events triggered either by the Viewer or by the user.

The most simple example is the user pressing a key to show something ingame: the controller listens to the pressed key, the model processes this input and the viewer outputs it.
This is an important pattern for our project, as it allows all group elements to work simultaneously on the model, controller and viewers while also allowing models to have multiple viewers, something that can really come in handy.

### Template Method

The template method defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
This behavioral pattern is present in many aspects of our code, for example, in the creation of states, viewers and controllers.
For example:
- The State abstract class is defined
- Act1State, Act2State, Act3State classes are defined as extensions of the State class, overriding some of its' functions.
Overall, it is a nice pattern, as we can override only specific parts of the code, making them less suitable to errors triggered by changes to the rest of the code.

### Facade Method
In our current design, the utilization of the Facade Pattern provides a streamlined interface to a complex subsystem with multiple components. This approach allows us to selectively incorporate essential features, shielding the code from subsystem intricacies and promoting testability and replaceability. Furthermore, the integration of the Facade Pattern facilitates the expansion of Lanterna functionalities while upholding the principles of the Interface Segregation Principle.

## UML approach
 As coding is now complete, here's our finalized class diagram, illustrating the comprehensive structure of the game. Each class name is carefully chosen for clarity within the game's context.

## Design Challenges, Contextual Issues, and Solutions
### Viewers:

#### Challenge: GUI Complexity
Context: Designing a **text based** user interface (GUI) that effectively communicates the game's narrative and provides an engaging user experience.
Issue: Balancing simplicity with the need to convey story elements and game interactions through text based elements. Ensuring a visually appealing interface without overwhelming the player.

Solution: Employed the Composite Pattern to create a unified container for graphical elements, allowing seamless integration of diverse components. This facilitated a visually rich interface while maintaining a structured and modular design.

#### Challenge: Theming and Consistency
Context: Maintaining a consistent thematic presentation throughout the game.
Issue: Ensuring that visual elements align with the ancient Greek aesthetic and contribute to a cohesive storytelling experience. Avoiding visual inconsistencies that could disrupt immersion.

Solution: Implemented a meticulous design guideline emphasizing adherence to ancient Greek visual aesthetics. Consistently applied thematic elements, such as fonts and colors, to create a cohesive and immersive visual experience.

Some of these classes can be found in the following files:
- [Viewer](src/main/java/com/ldts/mythsmists/viewer/Viewer.java)
- [Element Viewer](src/main/java/com/ldts/mythsmists/viewer/game/ElementViewer.java)
- [Orpheus Viewer](src/main/java/com/ldts/mythsmists/viewer/game/OrpheusViewer.java)
- [Cerberus Viewer](src/main/java/com/ldts/mythsmists/viewer/game/CerberusViewer.java)
- [Map Viewer](src/main/java/com/ldts/mythsmists/viewer/game/MapViewer.java)
- [Menu Viewer](src/main/java/com/ldts/mythsmists/viewer/menu/MenuViewer.java)
- [Options Menu Viewer](src/main/java/com/ldts/mythsmists/viewer/menu/OptionsMenuViewer.java)

### Controllers:

#### Challenge: Input Handling
Context: Managing user inputs and translating them into meaningful actions within the game.
Issue: Developing a robust input handling system that responds accurately to user interactions.

Solution: Implemented a comprehensive input handling system optimized for keyboards to ensure responsiveness, minimizing input lag and synchronizing user actions with corresponding game events.

#### Challenge: Game Logic Integration
Context: Integrating controllers with underlying game logic.
Issue: Ensuring a smooth interaction between controllers and the game's logic to maintain a cohesive flow.

Solution: Established a well-defined interface between controllers and game logic, promoting modular and loosely coupled interactions. Applied the MVC architectural pattern to streamline communication between controllers, models, and viewers.

Some of these classes can be found in the following files:
- [Controller](src/main/java/com/ldts/mythsmists/controller/Controller.java)
- [Game Controller](src/main/java/com/ldts/mythsmists/controller/game/GameController.java)
- [Orpheus Controller](src/main/java/com/ldts/mythsmists/controller/game/OrpheusController.java)
- [Cerberus Controller](src/main/java/com/ldts/mythsmists/controller/game/CerberusController.java)
- [Map Controller](src/main/java/com/ldts/mythsmists/controller/game/MapController.java)
- [Menu Controller](src/main/java/com/ldts/mythsmists/controller/menu/MenuController.java)
- [Options Menu Viewer](src/main/java/com/ldts/mythsmists/controller/menu/OptionsMenuController.java)
- [Prologue Controller](src/main/java/com/ldts/mythsmists/controller/textsections/PrologueController.java)

### Models:

#### Challenge: Data Representation
Context: Representing game data effectively for storage and manipulation.
Issue: Designing models that capture essential game entities in a way that is both intuitive for developers and efficient for runtime performance.

Solution: Implemented data models with a focus on clarity and efficiency. Employed appropriate data structures and representations to enhance readability and support optimized runtime performance.

#### Challenge: Modular Design
Context: Creating modular models for extensibility.
Issue: Developing models that allow for easy expansion and modification as the game evolves.

Solution: Applied the Template Method pattern to create modular models, allowing selective overrides for specific functionalities. Ensured that changes to one aspect of the game did not adversely impact other components.

Some of these classes can be found in the following files:
- [Position](src/main/java/com/ldts/mythsmists/model/Position.java)
- [Cerberus](src/main/java/com/ldts/mythsmists/model/Elements/Cerberus.java)
- [Element](src/main/java/com/ldts/mythsmists/model/Elements/Element.java)
- [Map](src/main/java/com/ldts/mythsmists/model/game/map/Map.java)
- [Menu](src/main/java/com/ldts/mythsmists/model/menu/Menu.java)
- [Text Sections](src/main/java/com/ldts/mythsmists/model/textsections/TextSection.java)

### General:

#### Challenge: Storyline Integration
Context: Integrating the game's storyline with the overall design.
Issue: Balancing design choices to enhance the storytelling experience while aligning with the Greek myth theme.

Solution: Enforced a cohesive design narrative that complemented the Greek myth theme. Utilized the Facade Pattern to provide a streamlined interface for narrative elements, simplifying integration and promoting storyline coherence.

#### Challenge: Testing and Debugging
Context: Ensuring the reliability and stability of the game.
Issue: Implementing effective testing strategies to identify and address potential bugs, glitches, or performance issues.

Solution: Conducted thorough testing at various development stages, including unit testing, integration testing, and user testing. Employed debugging tools and regular code reviews to identify and rectify issues promptly. Balanced testing rigor with development timelines to ensure a stable and polished final product.

## Testing
### Viewer testing
We tested all viewers in our game via mocking the GUI class and the drawing functions.  
#### Text Section Viewer Testing:
- Streamlined text section viewing for enhanced readability.
- Initiated by configuring a list of sample sentences to emulate a text section, facilitated via @BeforeEach setup.
- Subsequent testing focused on validating the drawText() function's efficacy in displaying the sentences.
- Employed `Mockito.verify()` to assert testing conditions.

#### Menu Viewer Testing:
- Parallel approach to text section testing.
- Commenced by establishing a menu and its corresponding viewer.
- Subsequent evaluation involved testing the drawText() function to ensure accurate display of menu entries.
- Utilized `Mockito.verify()` as the benchmark for testing conditions.

#### Orpheus Viewer Testing:
- Executed Orpheus viewer testing by initializing an Orpheus object and a mocked GUI.
- Thoroughly examined the drawOrpheus() function to confirm the accurate representation of the character.
- Validated testing conditions through the use of Mockito.verify().
### Model Testing

#### Position Testing:
- Implemented a property-based test using jqwik.
- Conducted tests to retrieve left, right, up, and down coordinates of a given coordinate.
- Utilized `assertEquals()` as the testing condition.

### Sound Testing
#### AudioPlayer Testing:
- The setup involves creating a new AudioPlayer object and specifying a path to a song file (utilized "overture.wav" but compatible with any .wav file).
- Evaluated volume control functionality (volume up and volume down) by testing FloatControl float values.
- Rounded the FloatControl value due to multiple decimal places, maintaining test validity.
- Utilized `assertEquals()` for testing conditions.

### Controller Testing (Work in Progress...)

#### Orpheus Controller Testing:
- Configured the setup by creating a map (including various elements) and an Orpheus object.
- Conducted tests:
  - `moveRightEmpty()`: Examined Orpheus movement when there is no wall nearby.
  - `moveRightNotEmpty()`: Assessed Orpheus movement when there is a wall to its right, ensuring it does not move to the wall's position.
  - `dracmaCounterTest()`: Verified the Dracma counter increasing function's functionality by calling it and checking for value changes.
- Employed `assertEquals()` as the testing condition.

#### Map Controller Testing (Incomplete):
- Established the setup with a created map, an OrpheusController (later replacing the map's controller), and a MapController.
- Conducted the `checkpointTest()` to assess the flag variable checking if the player reached the checkpoint, a crucial aspect for state-changing.
- Utilized `assertEquals()` for testing conditions.
  
### Screenshot of coverage report

### Link to mutation testing report

## Self-evaluation

The tasks were distributed collaboratively, and each team member contributed their best efforts. This collaborative effort not only enhanced our knowledge of Java and design principles/patterns but also fostered teamwork among us.

- Clara Sousa: 33.3%
- João Mendes: 33.3%
- Miguel Moita: 33.3%

