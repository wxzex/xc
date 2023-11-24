# LiquidBounce
A free mixin-based injection hacked-client for Minecraft using Minecraft Forge, supporting version 1.8.9

## License
This project is subject to the [GNU General Public License v3.0](LICENSE). This does only apply for source code located directly in this clean repository. During the development and compilation process, additional source code may be used to which we have obtained no rights. Such code is not covered by the GPL license.

## Setting up a Workspace
LiquidBounce is using Gradle, so make sure that it is installed properly. Instructions can be found on [Gradle's website](https://gradle.org/install/).
1. Clone the repository using `git clone https://github.com/CCBlueX/LiquidBounce/`. 
2. CD into the local repository folder.
3. Switch to the legacy branch using `git checkout legacy`
4. Depending on which IDE you are using execute either of the following commands:
    - For IntelliJ: `gradlew --debug setupDevWorkspace idea genIntellijRuns build`
    - For Eclipse: `gradlew --debug setupDevWorkspace eclipse build`
5. Open the folder as a Gradle project in your IDE.
6. Select either the Forge or Vanilla run configuration.

## Contributing

We appreciate contributions. So if you want to support us, feel free to make changes to LiquidBounce's source code and submit a pull request. Currently, our main goals are the following:
1. Improve LiquidBounce's performance.
2. Re-work most of the render code.

If you have experience in one or more of these fields, we would highly appreciate your support.