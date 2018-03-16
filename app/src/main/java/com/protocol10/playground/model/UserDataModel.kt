package com.protocol10.playground.model

import com.google.gson.annotations.SerializedName

data class UserDataModel(@SerializedName("results")
                          val results: List<ResultsItem>?,
                          @SerializedName("info")
                          val info: Info)


data class Name(@SerializedName("last")
                val last: String = "",
                @SerializedName("title")
                val title: String = "",
                @SerializedName("first")
                val first: String = "")


data class Picture(@SerializedName("thumbnail")
                   val thumbnail: String = "",
                   @SerializedName("large")
                   val large: String = "",
                   @SerializedName("medium")
                   val medium: String = "")


data class Login(@SerializedName("sha1")
                 val sha: String = "",
                 @SerializedName("password")
                 val password: String = "",
                 @SerializedName("salt")
                 val salt: String = "",
                 @SerializedName("sha256")
                 val sha_256: String = "",
                 @SerializedName("username")
                 val username: String = "",
                 @SerializedName("md5")
                 val md: String = "")


data class Location(@SerializedName("city")
                    val city: String = "",
                    @SerializedName("street")
                    val street: String = "",
                    @SerializedName("postcode")
                    val postcode: Int = 0,
                    @SerializedName("state")
                    val state: String = "")


data class Info(@SerializedName("seed")
                val seed: String = "",
                @SerializedName("page")
                val page: Int = 0,
                @SerializedName("results")
                val results: Int = 0,
                @SerializedName("version")
                val version: String = "")


data class Id(@SerializedName("name")
              val name: String = "",
              @SerializedName("value")
              val value: String = "")


data class ResultsItem(@SerializedName("nat")
                       val nat: String = "",
                       @SerializedName("gender")
                       val gender: String = "",
                       @SerializedName("phone")
                       val phone: String = "",
                       @SerializedName("dob")
                       val dob: String = "",
                       @SerializedName("name")
                       val name: Name,
                       @SerializedName("registered")
                       val registered: String = "",
                       @SerializedName("location")
                       val location: Location,
                       @SerializedName("id")
                       val id: Id,
                       @SerializedName("login")
                       val login: Login,
                       @SerializedName("cell")
                       val cell: String = "",
                       @SerializedName("email")
                       val email: String = "",
                       @SerializedName("picture")
                       val picture: Picture)