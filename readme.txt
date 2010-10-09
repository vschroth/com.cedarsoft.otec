====
    Licensed under the GNU General Public License version 2 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

           http://www.gnu.org/licenses/gpl-2.0.txt

    This code is free software; you can redistribute it and/or modify it
    under the terms of the GNU General Public License version 2 only, as
    published by the Free Software Foundation.

    This code is distributed in the hope that it will be useful, but WITHOUT
    ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
    FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
    version 2 for more details (a copy is included in the LICENSE file that
    accompanied this code).

    You should have received a copy of the GNU General Public License version
    2 along with this work; if not, write to the Free Software Foundation,
    Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
====

Dieses Repository enthält die Übungsaufgaben zur Vorlesung "Objekttechnologien" der FH Reutlingen.


Projekt-Struktur:
------------------------------------
Dieses Java-Projekt ist entsprechend der Maven-Konventionen aufgebaut. Dies bedeutet insbesondere folgendes:

Alle projekt-relevanten Sourcen kommen in das Verzeichnis "src".
In diesem wird dann nach Produktiv- und Test-Code unterschieden, die in die entsprechenden Unterverzeichnisse
gespeichert werden ("main" bzw. "test").

In diesen Verzeichnissen kommen dann die Java-Quelldateien in den Ordner "java". Eventuelle Resourcen (wie z.B.
XML-Dateien oder ähnliches) werden dann in "resources" gespeichert.


- src
  - main              <-- Produktiv-Code
    - java              <-- Java-Klassen
    - resources         <-- Resourcen
  - test              <-- Test-Code
    - java              <-- Java-Klassen
    - resources         <-- Resource

