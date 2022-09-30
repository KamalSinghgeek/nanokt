@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.conena.nanokt

import java.net.URLDecoder
import java.net.URLEncoder

/**
 * @return `null` if the current CharSequence is empty. Otherwise the CharSequence is returned.
 */
inline fun <T : CharSequence> T.emptyAsNull() = ifEmpty { null }

/**
 * @return `null` if the current CharSequence is blank. Otherwise the CharSequence is returned.
 */
inline fun <T : CharSequence> T.blankAsNull() = ifBlank { null }

/**
 * @return A new [StringBuilder] with the current CharSequence.
 */
inline fun CharSequence.toStringBuilder() = StringBuilder(this)

/**
 * @return The current string encoded in application/x-www-form-urlencoded format using UTF-8.
 */
inline fun String.encodeUrl(): String = URLEncoder.encode(this, Charsets.UTF_8.name())

/**
 * @return Decodes the current string from application/x-www-form-urlencoded format using UTF-8.
 */
inline fun String.decodeUrl(): String = URLDecoder.decode(this, Charsets.UTF_8.name())

/**
 * Same as [CharSequence.indexOf] but returns `null` if the [char] was not found.
 * @param char The character to look for.
 * @param startIndex The index (including) to start searching from.
 * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
 * @return The index of the first occurrence of [char] or `null` if none is found.
 */
inline fun CharSequence.indexOfOrNull(
    char: Char,
    startIndex: Int = 0,
    ignoreCase: Boolean = false
): Int? {
    val result = indexOf(char = char, startIndex = startIndex, ignoreCase = ignoreCase)
    return if (result == -1) null else result
}

/**
 * Same as [CharSequence.indexOf] but returns `null` if the [string] was not found.
 * @param string The [String] to look for.
 * @param startIndex The index (including) to start searching from.
 * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
 * @return The index of the first occurrence of [string] or `null` if none is found.
 */
inline fun CharSequence.indexOfOrNull(
    string: String,
    startIndex: Int = 0,
    ignoreCase: Boolean = false
): Int? {
    val result = indexOf(string = string, startIndex = startIndex, ignoreCase = ignoreCase)
    return if (result == -1) null else result
}

/**
 * Same as [CharSequence.lastIndexOf] but returns `null` if the [char] was not found.
 * @param char The character to look for.
 * @param startIndex The index of character to start searching at.
 * The search proceeds backward toward the beginning of the string.
 * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
 * @return The index of the last occurrence of [char] or `null` if none is found.
 */
inline fun CharSequence.lastIndexOfOrNull(
    char: Char,
    startIndex: Int = lastIndex,
    ignoreCase: Boolean = false
): Int? {
    val result = lastIndexOf(char = char, startIndex = startIndex, ignoreCase = ignoreCase)
    return if (result == -1) null else result
}

/**
 * Same as [CharSequence.lastIndexOf] but returns `null` if the [string] was not found.
 * @param string The [String] to look for.
 * @param startIndex The index of character to start searching at.
 * The search proceeds backward toward the beginning of the string.
 * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
 * @return The index of the last occurrence of [string] or `null` if none is found.
 */
inline fun CharSequence.lastIndexOfOrNull(
    string: String,
    startIndex: Int = lastIndex,
    ignoreCase: Boolean = false
): Int? {
    val result = lastIndexOf(string = string, startIndex = startIndex, ignoreCase = ignoreCase)
    return if (result == -1) null else result
}