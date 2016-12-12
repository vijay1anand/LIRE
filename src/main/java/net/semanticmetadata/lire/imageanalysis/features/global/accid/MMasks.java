package net.semanticmetadata.lire.imageanalysis.features.global.accid;

/**
 * Created by Nektarios on 30/3/2015.
 */
public class MMasks {
    private int[][][] mMasks =
            {{{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255}},
                    {{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255}},
                    {{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0}},
                    {{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255}},
                    {{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0}},
                    {{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255}},
                    {{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{255, 0, 0, 255, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0}},
                    {{255, 255, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 255, 0, 0, 255, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 255, 0, 0, 255, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 255, 0, 0, 255},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{ 0, 0, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 255, 255, 255, 255, 255, 255},{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 0, 0, 0, 0, 255, 255, 255, 255},{255, 255, 255, 255, 0, 0, 0, 0, 255, 255},{255, 255, 255, 255, 255, 255, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{ 0, 0, 0, 255, 255, 255, 255, 255, 255, 255},{ 0, 0, 0, 0, 0, 0, 0, 255, 255, 255},{255, 255, 255, 0, 0, 0, 0, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 0, 0, 0},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}},
                    {{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255},{255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}};

    public int[][][] getMmasks(){
        return mMasks;
    }
}
