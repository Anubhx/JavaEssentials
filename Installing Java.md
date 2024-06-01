# Installing Java on Windows

To install Java on a Windows system, follow these steps:

## Step 1: Download Java Development Kit (JDK)
1. Go to the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Accept the license agreement.
3. Download the appropriate JDK installer for your Windows system (e.g., Windows x64 Installer for 64-bit systems or Windows x86 Installer for 32-bit systems).

## Step 2: Run the Installer
1. Once the download is complete, double-click the downloaded installer file to run it.
2. Follow the installation wizard instructions.
3. Choose the installation directory and click "Next".
4. Wait for the installation process to complete.

## Step 3: Set Up Environment Variables (Optional)
1. After installation, you may need to set up the `JAVA_HOME` and `PATH` environment variables:
   - Right-click on "This PC" or "My Computer" and select "Properties".
   - Click on "Advanced system settings".
   - In the System Properties window, click on the "Environment Variables" button.
   - Under System Variables, click "New" and add `JAVA_HOME` with the path to the JDK installation directory (e.g., `C:\Program Files\Java\jdk-11.0.12`).
   - Find the `Path` variable in the list of System Variables, select it, and click "Edit".
   - Add `%JAVA_HOME%\bin` to the end of the existing Path (e.g., `C:\Program Files\Java\jdk-11.0.12\bin`).
   - Click "OK" to save the changes.

## Step 4: Verify Installation
1. Open Command Prompt (cmd.exe).
2. Type `java -version` and press Enter.
3. If Java is installed correctly, you should see the version information.

# Installing Java on macOS

To install Java on a macOS system, follow these steps:

## Step 1: Install Homebrew (Optional)
1. If you don't already have Homebrew installed, open Terminal.
2. Paste the following command and press Enter:
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
3. Follow the on-screen instructions to complete the installation.

## Step 2: Install Java Development Kit (JDK)
1. Open Terminal.
2. Run the following command to install the AdoptOpenJDK package using Homebrew:
   ```bash
   brew install --cask adoptopenjdk
   ```
   This command installs the AdoptOpenJDK distribution, which is one of the popular choices for Java development on macOS.

## Step 3: Verify Installation
1. After installation, open Terminal.
2. Type `java -version` and press Enter.
3. If Java is installed correctly, you should see the version information.

By following these steps, you can install Java on both Windows and macOS systems. 