[![platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com)
[![License](https://img.shields.io/badge/license-MIT-EA4235.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![jitpack](https://jitpack.io/v/KylixEza/Raion-UI-Kit.svg)](https://jitpack.io/#KylixEza/Raion-UI-Kit)

# Raion-UI-Kit📚

### Prerequisites

- For old version of gradle (before arctic fox update)

  Add this in your root `build.gradle` file (project scope) :

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
- For gradle version 7 or latest
  
  Add this in your root `setting.gradle` file :
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Dependency

Add this to your module's `build.gradle` file :

```gradle
dependencies {
	...
	implementation 'com.github.KylixEza:Raion-UI-Kit:version'
}
```
you can check the version on jitpack badge above or on release tag

# RaionToast 🍞

### Usage

```kotlin
RaionToast.Builder()
    .setContext(this@MainActivity)
    .setText("Hello there this is RaionToast")
    .setLogoVisibility(true)
    .setDuration(Toast.LENGTH_SHORT)
    .setToastType(ToastType.INFO)
    .setToastShape(ToastShape.RECTANGLE)
    .build().show()
 ```
 
 | Method / Class | Parameter | Usage | Attribute Default Value |
| ------ | :---------: | ----- | :-------------------: | 
| ```Builder```| - | Build the toast | No default value because it's mandatory |
| ```setText``` | ```String``` | To set message that will shown from toast | ```""``` |
| ```setToastType``` | ```ToastType``` | To set type of toast | ```ToastType.NORMAL``` |
| ```setLogoVisibility``` | ```Boolean``` | To set visibility of Raion logo  | ```true``` |
| ```setDuration``` | ```Int```| To set duration of toast | ```Toast.LENGTH_SHORT``` |
| ```setToastShape``` | ```ToastShape``` | To set shape of toast | ```ToastShape.ROUNDED``` |
| ```build``` | - | To create the toast => returns toast object | - |

# RaionSneeze (Snackbar) 🥨 

### Usage

- To display a normal Snackbar:

```kotlin
RaionSneeze.makeNormalSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG).show()
RaionSneeze.showNormalSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG)
```

- To display a success Snackbar:

``` kotlin
RaionSneeze.makeSuccessSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG).show()
RaionSneeze.showSuccessSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG)
```
- To display an error Snackbar:

``` kotlin 
RaionSneeze.makeErrorSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG).show()
RaionSneeze.showErrorSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG)
```

- To display an warning Snackbar:

``` kotlin
RaionSneeze.makeWarningSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG).show()
RaionSneeze.showWarningSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG)
```
- To display an info Snackbar:

``` kotlin
RaionSneeze.makeInfoSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG).show()
RaionSneeze.showInfoSneeze(findViewById(R.id.content), "Hello there this is raion snackbar", Snackbar.LENGTH_LONG)
```

## Contributing

Please fork this repository and contribute back using.

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## Contributors
<p>
<img src="https://images.weserv.nl/?url=avatars.githubusercontent.com/u/58837451?v=4&h=100&w=100&fit=cover&mask=circle&maxage=7d"/>
 &nbsp
<img src="https://images.weserv.nl/?url=avatars.githubusercontent.com/u/74236720?v=4&h=100&w=100&fit=cover&mask=circle&maxage=7d"/>
</p>
  
## Contact
<a href="https://www.linkedin.com/company/raioncommunity" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="kylix-eza-saputra-1bb1b7192" height="30" width="40" /></a>
<a href="https://www.instagram.com/raion_community/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="k_ylix" height="30" width="40" /></a>

<p>
Don't forget to ⭐this repository to motivates me to share more open source library
</p>
