package dji.sampleV5.modulecommon.data

import dji.v5.common.video.channel.VideoChannelState
import dji.v5.common.video.channel.VideoChannelType
import dji.v5.common.video.decoder.DecoderState
import dji.v5.common.video.stream.StreamSource

data class VideoChannelInfo(var videoChannelState: VideoChannelState = VideoChannelState.CLOSE) {
    var streamSource: StreamSource? = null
    var videoChannelType: VideoChannelType = VideoChannelType.PRIMARY_STREAM_CHANNEL
    var decoderState: DecoderState = DecoderState.INITIALIZED
    var resolution: String = DEFAULT_STR
    var format: String = DEFAULT_STR
    var fps: Int = -1
    var bitRate: Double = -1.0
    var socket: String = DEFAULT_STR
}
