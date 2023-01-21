/*
 * Copyright (C) 2023 Fabian Andera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.conena.nanokt.jvm

import java.text.DateFormat
import java.util.Date

/**
 * Same as [DateFormat.format] but returns null if [date] is null.
 * @param date The date to format.
 * @return The formatted date time string or null if [date] was null.
 */
inline fun DateFormat.formatOrNull(date: Date?): String? {
   return format(date ?: return null)
}