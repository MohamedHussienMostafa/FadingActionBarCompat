FadingActionBarCompat
==================
FadingActionBar is a library which implements the cool fading action bar effect that can be seen in the new Play Music app.

This library uses the techniques outlined by Cyril Mottier in [a recent blog post][1].

For reasons of backwards compatibility this library relies on ActionBarSherlock. If your app uses the native action bar, there is [a fork][2] for you.

![Example Image][3]

Try out the sample application:

Will be available soon...

Or browse the [source code of the sample application][4] for a complete example of use.

Including in your project
-------------------------
Add library to your application project. Here are the dependencies (Don't forget using ActionBarCompat, located in [contrib][11] dir):

* library
    --> libs/support-v4-18
    --> contrib/appcompat (include this project too)
* sample
    --> library

Or if you use Gradle, just open your project with Android Studio or via console (in your project root):

```
$./gradlew clean installDebug (it will install the debug apk in your device)
```

Usage
-----
Using the library is really simple, just look at the source code of the provided samples:

* [If your content should be in a `ScrollView`][5].
* [If your content should be in a `ListView`][6].

You can even use the library [from a fragment][7], which is useful when implementing a dual phone/tablet layout.


*Tutorials for all these scenarios are in the works*


Acknowledgements
--------------------
* Thanks to [Cyril Mottier][8] for sharing the techniques that make this library possible.
* Thanks to [Manuel Peinado] [9] for writing the FadingActionBar based on Sherlock compatibility (almost all the hard work)

Who's using it
--------------
*Does your app use FadingActionBarCompat? If you want to be featured on this list drop me a line.*


Known Bugs
--------------
* There is a little bug related to NavigationDrawer Activity. On configuration change, the ActionBar returns null and it can't apply background... working on it!


Developed By
--------------------

César Díez Sánchez - <cesaryomismo@gmail.com>

<a href="https://twitter.com/menorking">
  <img alt="Follow me on Twitter" src="https://raw.github.com/ManuelPeinado/NumericPageIndicator/master/art/twitter.png" />
</a>
<a href="https://plus.google.com/115273462230054581675">
  <img alt="Follow me on Google+" src="https://raw.github.com/ManuelPeinado/NumericPageIndicator/master/art/google-plus.png" />
</a>
<a href="http://lnkd.in/cc4YKZ">
  <img alt="Follow me on LinkedIn" src="https://raw.github.com/ManuelPeinado/NumericPageIndicator/master/art/linkedin.png" />


License
-----------

    Copyright 2013 César Díez Sánchez

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [1]: http://cyrilmottier.com/2013/05/24/pushing-the-actionbar-to-the-next-level/
 [2]: https://raw.github.com/ManuelPeinado/FadingActionBar-Native
 [3]: https://raw.github.com/ManuelPeinado/FadingActionBar/master/art/readme_pic.png
 [4]: https://github.com/m3n0R/FadingActionBarCompat/tree/master/sample
 [5]: https://github.com/m3n0R/FadingActionBarCompat/blob/master/sample/src/main/java/com/manuelpeinado/fadingactionbar/compat/sample/ScrollViewActivity.java
 [6]: https://github.com/m3n0R/FadingActionBarCompat/blob/master/sample/src/main/java/com/manuelpeinado/fadingactionbar/compat/sample/ListViewActivity.java
 [7]: https://github.com/m3n0R/FadingActionBarCompat/blob/master/sample/src/main/java/com/manuelpeinado/fadingactionbar/compat/sample/SampleFragment.java
 [8]: http://cyrilmottier.com
 [9]: https://github.com/ManuelPeinado
 [10]: https://play.google.com/store/apps/details?id=com.yavorivanov.android.danswithme
 [11]: https://github.com/m3n0R/FadingActionBarCompat/tree/master/contrib


