import { defineConfig } from 'vitepress'

export default defineConfig({
  lang: 'zh-CN',
  title: 'Celerity',
  description: 'Celerity document',

  mpa: true,
  base: '/',
  scrollOffset: 'header',
  lastUpdated: false,

  srcDir: './src',
  assetsDir: 'assets',
  outDir: './.vitepress/dist',
  cacheDir: './.vitepress/.cache',

  themeConfig: {
    nav: [
      { text: '首页', link: '/', activeMatch: '^/$' },
      { text: '手册', link: '/manual/', activeMatch: '^/manual/' },
      { text: 'Guide', link: '/guide' },
      { text: 'Config', link: '/config' },
      { text: 'GitHub', link: 'https://github.com/odedev/celerity' }
    ],
    sidebar: {
      '/manual/': [
        {
          text: 'Guide',
          collapsed: false,
          items: [
            { text: 'Index', link: '/guide/' },
            { text: 'One', link: '/guide/one' },
            { text: 'Two', link: '/guide/two' }
          ]
        }
      ],
      '/config/': [
        {
          text: 'Config',
          collapsed: false,
          items: [
            { text: 'Index', link: '/config/' },
            { text: 'Three', link: '/config/three' },
            { text: 'Four', link: '/config/four' }
          ]
        }
      ]
    }
  },
  markdown: {
    lineNumbers: false,
    toc: {
      includeLevel: [1, 2]
    },
  },
})
