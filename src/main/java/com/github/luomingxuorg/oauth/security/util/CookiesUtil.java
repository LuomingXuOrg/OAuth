/*
 *  Copyright 2018-2019 LuomingXuOrg
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
 *  limitations under the License.
 *
 *  Author : Luoming Xu
 *  File Name : CookiesUtil.java
 *  Url: https://github.com/LuomingXuOrg/OAuth
 */

package com.github.luomingxuorg.oauth.security.util;

import com.github.luomingxuorg.oauth.security.conf.Token;

import javax.servlet.http.Cookie;

public class CookiesUtil
{
    public static String getJwtTokenFromCookies(Cookie[] cookies)
    {
        if (cookies == null || cookies.length < 1)
        {
            return null;
        }

        for (Cookie cookie : cookies)
        {
            if (cookie.getName().equals(Token.Jwt_Token))
            {
                return cookie.getValue();
            }
        }

        return null;
    }
}
