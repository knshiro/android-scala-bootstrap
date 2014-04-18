import android.Keys._

// If you want to use apklibs or aars
// import android.Dependencies.{apklib,aar}

android.Plugin.androidBuild

name := "my-scala-app"

scalaVersion := "2.10.4"

// scala 2.10 flag for feature warnings
scalacOptions in Compile += "-feature"

platformTarget in Android := "android-18"

// Support library
// libraryDependencies += "com.android.support" % "support-v4" % "19.0.1"


// Play services (need to be installed first via android manager)

//libraryDependencies += aar("com.google.android.gms" % "play-services" % "4.2.42")

// Some proguard options
//proguardOptions in Android ++= Seq(
//  "-keepnames @com.google.android.gms.common.annotation.KeepName class *",
//  """-keepclassmembernames class * {
//      @com.google.android.gms.common.annotation.KeepName *;
//  }"""
//)


// Example of using library here scaloid (lots of helpers for android in scala)

// First the library
//libraryDependencies += "org.scaloid" %% "scaloid" % "3.2.1-8"

// Some proguard options
//proguardOptions in Android += "-keep class org.scaloid.**"

//proguardOptions in Android ++= Seq(
//  "-keep class org.scaloid.**",
//  "-keep class org.scaloid.common.TraitContext** { *; }"
//)

// Put the library in the cache so it doesn't need to be filtered at each compilation
//proguardCache in Android += ProguardCache("org.scaloid") % "org.scaloid" %% "scaloid"

