/*
 * matrix-appservice-voip - Matrix Bridge to VoIP/SMS
 * Copyright (C) 2018 Kamax Sarl
 *
 * https://www.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.matrix.bridge.voip.matrix;

import io.kamax.matrix.client._MatrixClient;

public class MatrixBridgeUser {

    private _MatrixClient client;
    private String localId;
    private String remoteId;

    public MatrixBridgeUser(_MatrixClient client, String localId, String remoteId) {
        this.client = client;
        this.localId = localId;
        this.remoteId = remoteId;
    }

    public _MatrixClient getClient() {
        return client;
    }

    public String getLocalId() {
        return localId;
    }

    public String getRemoteId() {
        return remoteId;
    }

}
