#  Siguria e të Dhënave
Projekti në lëndën Siguria e të Dhënave
Faza e parë, __Grupi27__.

Ky projekt u zhvillua në gjuhën programuese:
 [Java SE Development Kit 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) 
# Qëllimi
 Një console program me emrin ***ds*** i cili pranon komanda përmes argumenteve. Programi do t’i analizojë argumentet, dhe varësisht nga përmbajtja e tyre do ta ekzekutojë ndonjërën prej komandave:
 - ***Count***  - Numëron paraqitjen e njësisë <unit> në tekst<text>. 
 - ***Case*** - E konverton tekstin <text> në madhësinë e dhënë<case>.
 - ***Tap code*** - Enkodon tekstin<text> në Tap Kodin dhe Dekodon vargun nga Tap Kodi në alfabet latin.

# Parakushtet
 * Choosing your Java IDE(Për shkruarjen e programeve me anë të gjuhës programuese Java)
 * Choosing your Command line (Për thirrjen e argumenteve - args passing)
```
Për këtë projekt u përdorën:
 * IntelliJ IDEA 2019.1.2 
 * Git Bash
```


# Instruksionet
1. Vendosja e tri komandave(***count,case,tap-code**)* dhe programit ***ds*** në një directory të vetëm,pra:
![Directory në këtë rast: ProjektiSiguri/](https://images2.imagebam.com/e6/2a/ac/1a09b71337326461.PNG)
2. Kompajllimi me anë të
  **Java programming language compiler**
  (*javac* pronounced "**java**-see")
 në **command line**(*git bash* në këtë rast):
 
![javac](https://images2.imagebam.com/d2/68/da/e122271337326893.PNG)</br>
```Ju mund të përdorni një "wildcard" që të kompajlloni të gjitha fajllat brenda një folderi, si psh: javac *.java```

# Ekzekutimi i komandave
Ekzekutimi i komandave *count,case,tap-code* përmes thirrjes së argumenteve të programit main ***ds*** nga command line.
## Komanda count

count | unit | text
--- | --- | ---
|komanda |lines,words, letters, symbols,vowels, consonants,sentences|**Përshëndetje nga FIEK!**

<p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/76/93/f9/c0f9341337430291.png" alt="sintaksa" style="width: 250px;"/></p>

**Shembull:**

>type ***java*** before **'ds'** to run your program on cmd.

```$ ds count lines "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/47/d0/50/ae6b4b1337331187.PNG" alt="" width="400px">


```$ ds count words "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/77/13/00/33824b1337331397.PNG" alt="" width="400px">

```$ ds count letters "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/9a/f1/af/9f9ab01337332291.PNG" alt="" width="400px">

```$ ds count symbols "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/7d/93/e4/4773821337332618.png" alt="" width="400px">

```$ ds count vowels "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/ce/3f/b8/41d0821337332764.png" alt="" width="400px"/>

```$ ds count consonants "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/9c/03/9a/bc3a2a1337333122.PNG" alt="" width="400px">

```$ ds count sentences "Pershendetje. nga FIEK!"```</br>
<img src="https://images2.imagebam.com/ae/57/40/f7ccf41337333290.PNG" alt="" width="400px">

## Komanda case

| case    | case(funksioni)                                     | text                       |
| :------ | --------------------------------------------------- | -------------------------- |
| komanda | upper,lower,capitalize,inverse,alternating,sentence | **Përshëndetje nga FIEK!** |

<p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/d3/06/91/1d68e51337430295.png" alt="sintaksa" style="width: 250px;"/></p>

**Shembull:**

>type ***java*** before **'ds'** to run your program on cmd.

```$ ds case upper "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/27/2c/98/7800d01337426620.png" alt="" width="400px">

```$ ds case lower "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/f7/f2/1f/0960e31337426631.PNG" alt="" width="400px">

```$ ds case capitalize "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/a5/87/46/36a01d1337426616.PNG" alt="" width="400px">

```$ ds count inverse "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/92/d8/f6/1b246e1337426624.PNG" alt="" width="400px">

```$ ds count alternating "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/9c/07/19/0546911337426607.PNG" alt="" width="400px">

```$ ds count sentence "pershendetje, Fjalia E pare. FJALIA E DYTE! fjAlia E trEte."```</br><img src="https://images2.imagebam.com/80/be/b3/3aa1981337426637.PNG" alt="" width="400px">


## Komanda tap-code
***Tap-Code*** enkodon dhe dekodon `<tekstin>` sipas tabelës: 

![enter image description here](https://images2.imagebam.com/ce/82/3c/5563ab1337335448.png)

> eg.
```Shkronja 'N' -> ... ...``` Rreshti 3 - Shtylla 3

|plaintext| ciphertext |
|--|--|
| neser |  ... ...  . .....  .... ...  . ..... .... ..|

 - Shkronjat ndërmjet vete ndahen me nga dy space
 - Ndërsa fjalet ndahen me : "  /  "
 - Lexo më shumë për [Tap-Code](https://www.braingle.com/brainteasers/codes/tapcode.php).

<p align="center"><b><em>Sintaksa :</em></b></br>
 <img src="https://images2.imagebam.com/bb/83/d1/d52e831337442864.png" alt="" width="400px"></p>

**Shembull:**

>type ***java*** before **'ds'** to run your program on cmd.

```$ ds tap-code encode "i can fly"```</br><img src="https://images2.imagebam.com/8f/b9/06/029e391337336916.PNG" alt="" width="600px">

```$ ds tap-code decode ".. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ...."```</br><img src="https://images2.imagebam.com/7b/03/60/d12f111337336918.PNG" alt="" width="600px">



























## Kompajllimi përmes shell script
Argumentet ose variablat mund të kalohen në një skenar shell (*shell script*). Thjesht renditni argumentet në vijën e komandës kur ekzekutoni një shell script. Në skriptet shell, 0 $ është emri i komandës së ekzekutuar (zakonisht emri i skedarit të skriptit të guaskës); 1 $ është argumenti i parë, 2 $ është argumenti i dytë, 3 $ është argumenti i tretë,etj.

 1. Fajllin ***ds.sh***  e vendosim në directoryn e njejtë me fajllat e tjer (ProjektiSiguri/) 
 2. Pas gjetjes së directoryt në cmd
 Kompajllojm ds scripten:
```bash
$ ./ds.sh compile

$ ./ds.sh count lines "Pershendetje nga FIEK!"
Lines: 1

$ ./ds.sh tap-code encode "this is a code"
.. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ....


```

 ## Falënderim për

Disa nga meritorët e suksesit dhe përfundimit të kësaj faze të parë të Projektit :

* [Stack Overflow](https://stackoverflow.com/)
  * [Metoda capitalize](https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string/1892778?fbclid=IwAR0yYzxmvyVgsi3uL8Of39I4NZvKEM-17GBLM4jTVW2SlqSdi71epYk22AI)
  
* Ass. *Edon Gashi* (i cili ka qenë në dispozicion çdo kohë për t'iu përgjigjur pyetjeve tona)

## Autorët

* [Aurel Demiraj](mailto:aureldem1@outlook.com)
* [Besar Pallush](mailto:besarp5@gmail.com)
* [Durajet Mustafa](mailto:eti1375@gmail.com)

___
<small><i>Përshkrimi i<a href='https://www.dropbox.com/s/aryposlxmi1qctk/grupi-27.pdf?dl=0'> projektit</a></i>,</br>
Regards Grupi27 (Sferat e Dragoit).</small>


  



